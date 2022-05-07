class EmployeeController < ApplicationController
    def index
        @employees = fetch_employees 
        unless @employees 
            flash[:alert] = 'Employees not found'
            return render action: :index 
        end
    end

    private 
    
    def request_api(url)
        response = Excon.get(url)
        return nil if response.status != 200
        return JSON.parse(response.body)
    end
    
    def fetch_employees
        request_api("http://localhost:8080/employees")
    end
end